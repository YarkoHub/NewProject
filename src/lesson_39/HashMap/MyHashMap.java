package lesson_39.HashMap;

import java.util.*;

public abstract class MyHashMap<K, V> implements InterfaceHashMap<K, V> {

    private Node<K, V>[] buckets;
    private int capacity = 16;
    private double loadFactor = 0.75;
    private int size;

    public MyHashMap() {
        this.buckets = (Node<K, V>[]) new Node[capacity];
    }


    @Override
    public V put(K key, V value) {
        int index = getIndex(key, capacity); // Вычисляем индекс корзины
        Node<K, V> node = buckets[index]; // Получаем первую ноду в корзине
        Node<K, V> newNode = new Node<>(key, value); // Создаем новую ноду для вставки

        // Если корзина пуста, просто добавляем новую ноду
        if (node == null) {
            buckets[index] = newNode;
            size++;
            // Проверяем, не пора ли увеличить размер массива
            if ((double) size / capacity > loadFactor) {
                resize();
            }
            return null; // Новый элемент добавлен успешно
        }

        Node<K, V> prev = null;
        // Проходим по цепочке, чтобы найти нужный ключ
        while (node != null) {
            if (node.key.equals(key)) { // Если ключ найден, обновляем значение
                V oldValue = node.value;
                node.value = value;
                return oldValue; // Возвращаем старое значение
            }
            prev = node;
            node = node.next;
        }
        // Если ключ не найден в цепочке, добавляем его в конец
        prev.next = newNode;
        size++;
        // Проверяем, не пора ли увеличить размер массива
        if ((double) size / capacity > loadFactor) {
            resize();
        }
        return null; // Новый элемент добавлен успешно
    }


    @Override
    public V get(Object key) {
        int index = getIndexObject(key); // Вычисляем индекс корзины
        Node<K, V> node = buckets[index]; // Получаем первую ноду в корзине

        // Проходим по цепочке, чтобы найти нужный ключ
        while (node != null) {
            if (node.key.equals(key)) { // Если ключ найден, возвращаем значение
                return node.value;
            }
            node = node.next;
        }
        return null; // Ключ не найден
    }


    @Override
    public V remove(Object key) {
        int index = getIndexObject(key); // Вычисляем индекс корзины
        Node<K, V> node = buckets[index]; // Получаем первую ноду в корзине
        Node<K, V> prev = null;

        // Проходим по цепочке, чтобы найти нужный ключ
        while (node != null) {
            if (node.key.equals(key)) { // Если ключ найден
                if (prev != null) {
                    prev.next = node.next; // Удаляем ноду из цепочки
                } else {
                    buckets[index] = node.next; // Если это первый элемент в корзине
                }
                size--; // Уменьшаем размер карты
                return node.value; // Возвращаем удаленное значение
            }
            prev = node;
            node = node.next;
        }
        return null; // Ключ не найден
    }

    @Override
    public Set<K> keySet() {
        Set<K> result = new HashSet<>();
        for (Node<K, V> node : buckets) {
            while (node != null) {
                result.add(node.key);
                node = node.next;
            }
        }

        return result;
    }

    @Override
    public Collection<V> values() {
        List<V> values = new ArrayList<>();

        for (Node<K, V> bucket : buckets) {
            Node<K, V> node = bucket;
            // Проходим по цепочке и добавляем все значения в список
            while (node != null) {
                values.add(node.value);
                node = node.next;
            }
        }
        return values;
    }

    @Override
    public boolean containsKey(Object key) {
        int index = getIndexObject(key); // Вычисляем индекс корзины
        Node<K, V> node = buckets[index]; // Получаем первую ноду в корзине

        // Проходим по цепочке, чтобы найти нужный ключ
        while (node != null) {
            if (node.key.equals(key)) { // Если ключ найден, возвращаем true
                return true;
            }
            node = node.next;
        }
        return false; // Ключ не найден
    }

    @Override
    public void clear() {
        capacity = 16;
        buckets = (Node<K, V>[]) new Node[capacity];
        size = 0;
    }



   // @Override
    public V removeNode(Node<K, V> previous, Node<K, V> current, int index) {
        V value = current.value; // Сохраняем значение текущего узла

        if (previous == null) {
            // Если предыдущий узел равен null, значит, удаляемый узел находится в начале цепочки
            buckets[index] = current.next; // Обновляем начало цепочки
        } else {
            // Иначе удаляемый узел находится в середине или в конце цепочки
            previous.next = current.next; // Пропускаем удаляемый узел
        }

        size--; // Уменьшаем размер хэш-таблицы
        return value; // Возвращаем значение удаленного узла
    }

    @Override
    public V getOrDefault(Object key, V defaultValue) {
        int index = getIndexObject(key); // Получаем индекс корзины для данного ключа
        Node<K, V> node = buckets[index]; // Получаем первый узел в корзине

        // Проверяем цепочку в корзине на наличие ключа
        while (node != null) {
            if (node.key.equals(key)) { // Если ключ найден, возвращаем его значение
                return node.value;
            }
            node = node.next; // Переходим к следующему узлу в цепочке
        }

        return defaultValue; // Возвращаем значение по умолчанию, если ключ не найден
    }

    @Override
    public boolean isEmpty() {
        return size == 0; // Возвращаем true, если размер карты равен нулю, иначе false
    }

    @Override
    public void resize() {
        System.out.println("\nПересчет карты==============\n");

        // Увеличиваем емкость вдвое
        capacity *= 2;

        // Создаем новый массив увеличенной емкости
        Node<K, V>[] newBuckets = (Node<K, V>[]) new Node[capacity];

        // Переносим все элементы из старого массива в новый, пересчитывая хэши и индексы
        for (Node<K, V> node : buckets) {
            while (node != null) {
                // Вычисляем новый индекс для узла в новом массиве
                int newIndex = getIndex(node.key, capacity);

                // Сохраняем ссылку на следующий узел, чтобы не потерять цепочку
                Node<K, V> next = node.next;

                // Присваиваем текущему узлу новую цепочку
                node.next = newBuckets[newIndex];

                // Обновляем ссылку на узел в новом массиве
                newBuckets[newIndex] = node;

                // Переходим к следующему узлу в старом массиве
                node = next;
            }
        }

        // Обновляем ссылку на массив
        buckets = newBuckets;

        System.out.println("Пересчет завершен");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (Node<K, V> node : buckets) {
            if (node != null) {
                sb.append(node.getList());
            }
        }

        return sb.append("]").toString();
    }

    private int getIndex(K key, int capacity) {
        //проверка ключа на null
        if (key == null) return 0;


        // capacity ДОЛЖНО быть степенью двойки
        int index = key.hashCode() & (this.capacity - 1);

//        System.out.println("index: " + index);
        return index;
    }

    //Получение индекса в массиве корзин по hashCode ключа
    private int getIndexObject(Object key) {
        //"Обрезание" hashCode в рамки от 0 до capacity-1 включительно
        return key != null ? key.hashCode() & (capacity - 1) : 0;
    }

    @Override
    public int size() {
        return size;
    }

    private static class Node<K, V> {
        private K key;
        private V value;
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" +
                    key +
                    ": " + value +
                    '}';
        }

        public String getList() {
            Node<K, V> cursor = this;
            StringBuilder sb = new StringBuilder("[");
            while (cursor != null) {
                sb.append(cursor);
                sb.append(", ");
                cursor = cursor.next;
            }

            sb.setLength(sb.length() - 2);
            return sb.append("]").toString();

        }
    }

}
