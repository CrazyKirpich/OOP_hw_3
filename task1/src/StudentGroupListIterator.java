import java.util.Iterator;

public class StudentGroupListIterator implements Iterator<Student>
{
	private int index = -1;
	private int count;
	private int temp = 0;
	private StudentGroup studentGroup;

	public StudentGroupListIterator(StudentGroup studentGroup)
	{
		this.studentGroup = studentGroup;
		this.count = studentGroup.getSize();
	}

	@Override
	public boolean hasNext() {
		return index >= -1;
	}

	@Override
	public Student next()
	{
		if (temp <= count - 1)
		{
			temp++;
			return studentGroup.get(++index);
		}
		if (temp >= count - 1)
		{
			if (index <= 0)
			{
				index -= 2;
				return studentGroup.get(0);
			}
			return studentGroup.get(index--);
		}
		return null;

	}
}
