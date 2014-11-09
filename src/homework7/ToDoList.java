package homework7;

/**
 * This class encapsulates a Task list using a singly-linked list with a reference to the first Task.
 */
public class ToDoList
{
	private Task first;

	public ToDoList()
	{
		first = null;
	}
	public ToDoList(Task first)
	{
		this.first = first;
	}

	/**
	 * Add a Task at the front of the list.
	 * @param newTask the Task to add
	 */
	public void addFirst(Task newTask)
	{
		// YOUR CODE HERE
	}

	/**
	 * Add a Task at the end of the list.
	 * @param newTask the Task to add
	 */
	public void addLast(Task newTask)
	{
		// YOUR CODE HERE
	}

	/**
	 * For the Task with the given name, mark it as complete. If the Task doesn't exist, do nothing.
	 * @param name the name of the task to mark complete (set complete = true)
	 */
	public void setComplete(String name)
	{
		// YOUR CODE HERE
	}

	/**
	 * Return the Task at position i, if one exists. Otherwise, return null. The first item is at index 0.
	 * @param i the index to check
	 * @return the Task at that index
	 */
	public Task get(int i)
	{
		// YOUR CODE HERE
	}

	/**
	 * Print ONLY THE INCOMPLETE tasks to console. So print only the tasks where complete == false. Print 
	 * a numbered list.
	 * Ex:
	 * 1. name of first incomplete Task
	 * 2. name of second incomplete Task...
	 */
	public void print()
	{
		// YOUR CODE HERE
	}
}
