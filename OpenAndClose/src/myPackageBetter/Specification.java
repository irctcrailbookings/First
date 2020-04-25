package myPackageBetter;

public interface Specification<T> {
	boolean isSatisfied(T item);
}