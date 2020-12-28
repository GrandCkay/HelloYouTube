package JavaRush;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.*;

public class CommonList implements List<Long> {
    private ArrayList<Long> original = new ArrayList<Long>();

    public static void main(String[] args) {
    }

    @Override
    public synchronized int size() {
        return original.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return original.isEmpty();
    }

    @Override
    public synchronized boolean contains(@Nullable Object o) {
        return original.contains(o);
    }

    @Override
    public synchronized int indexOf(@Nullable Object o) {
        return original.indexOf(o);
    }

    @Override
    public synchronized int lastIndexOf(@Nullable Object o) {
        return original.lastIndexOf(o);
    }

    @NonNull
    @Override
    public synchronized Object[] toArray() {
        return original.toArray();
    }

    @NonNull
    @Override
    public synchronized <T> T[] toArray(@NonNull T[] a) {
        return original.toArray(a);
    }

    @Override
    public synchronized Long get(int index) {
        return original.get(index);
    }

    @Override
    public synchronized Long set(int index, Long element) {
        return original.set(index, element);
    }

    @Override
    public synchronized boolean add(Long aLong) {
        return original.add(aLong);
    }

    @Override
    public synchronized void add(int index, Long element) {
        original.add(index, element);
    }

    @Override
    public synchronized Long remove(int index) {
        return original.remove(index);
    }

    @Override
    public synchronized boolean remove(@Nullable Object o) {
        return original.remove(o);
    }

    @Override
    public synchronized void clear() {
        original.clear();
    }

    @Override
    public synchronized boolean addAll(@NonNull Collection<? extends Long> c) {
        return original.addAll(c);
    }

    @Override
    public synchronized boolean addAll(int index, @NonNull Collection<? extends Long> c) {
        return original.addAll(index, c);
    }

    @Override
    public synchronized boolean removeAll(@NonNull Collection<?> c) {
        return original.removeAll(c);
    }

    @Override
    public synchronized boolean retainAll(@NonNull Collection<?> c) {
        return original.retainAll(c);
    }


    @NonNull
    @Override
    public synchronized ListIterator<Long> listIterator(int index) {
        return original.listIterator(index);
    }


    @NonNull
    @Override
    public synchronized ListIterator<Long> listIterator() {
        return original.listIterator();
    }

    @NonNull
    @Override
    public synchronized Iterator<Long> iterator() {
        return original.iterator();
    }


    @NonNull
    @Override
    public synchronized List<Long> subList(int fromIndex, int toIndex) {
        return original.subList(fromIndex, toIndex);
    }

    @Override
    public synchronized boolean containsAll(@NonNull Collection<?> c) {
        return original.containsAll(c);
    }
}
