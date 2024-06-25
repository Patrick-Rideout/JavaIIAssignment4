/*
*
* Explain why inserting additional elements into an ArrayList
* object whose current size is less than its capacity is a relatively fast
* operation and why inserting additional elements into an ArrayList
* object whose current size is at its capacity is a relatively slow operation
*
* Answer:
*
* Adding elements to an ArrayList is relatively fast when its current size is below its capacity because it only
* involves placing the new element in the next available slot and increasing the ArrayList's size.
*
* Adding elements to an ArrayList that has reached capacity is relatively slow because the underlying array has
* to be resized. The resizing process requires creating a new, larger array and copying all existing elements into it
* with the addition of the element to be added, and then updating the reference. This makes the operation more
* time-consuming and resource-intensive.
*
* */