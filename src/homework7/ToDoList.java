package homework7;

/**
 * This class encapsulates a Task list using a singly-linked list with a reference to the first Task.
 */
public class ToDoList
{
	private Task first;

	public ToDoList()
	{
		this.first = null;
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
		newTask.next = this.first;
		this.first = newTask;
	}

	/**
	 * Add a Task at the end of the list.
	 * @param newTask the Task to add
	 */
	public void addLast(Task newTask)
	{
		if (this.first == null) { this.first = newTask; }
		else
		{
			Task current = this.first;
			while (current.next != null)
			{
				current = current.next;
			}
			current.next = newTask;
		}
	}

	/**
	 * For the Task with the given name, mark it as complete. If the Task doesn't exist, do nothing.
	 * @param name the name of the task to mark complete (set complete = true)
	 */
	public void setComplete(String name)
	{
		Task current = this.first;
		while (current != null)
		{
			if (current.getName().equals(name))
			{
				current.setComplete(true);
			}
			current = current.next;
		}
	}

	/**
	 * Return the Task at position i, if one exists. Otherwise, return null. The first item is at index 0.
	 * @param i the index to check
	 * @return the Task at that index or null if nothing is at that index
	 */
	public Task get(int i)
	{
		if (i < 0) { return null; }
		Task current = this.first;
		int count = 0;
		while (current != null)
		{
			if (count == i) { return current; }
			count++;
			current = current.next;
		}
		return null;
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
		Task current = this.first;
		int count = 1;
		while (current != null)
		{
			if (!current.getComplete())
			{
				System.out.println(count + ". " + current.getName());
				count++;
			}
			current = current.next;
		}
	}
}
