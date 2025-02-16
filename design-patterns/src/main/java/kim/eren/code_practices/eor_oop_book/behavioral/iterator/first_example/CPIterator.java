package kim.eren.code_practices.eor_oop_book.behavioral.iterator.first_example;

public interface CPIterator<T> {

	void first();

	void next();

	boolean isDone();

	T currentItem();
}
