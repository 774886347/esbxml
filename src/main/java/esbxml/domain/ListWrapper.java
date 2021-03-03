package esbxml.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * 
 */
@XmlRootElement(name = "service")
public class ListWrapper<T>
{
	private List<T> list;
	public ListWrapper() {}
	// 初始化全部成员变量的构造器
	public ListWrapper(List<T> list)
	{
		this.list = list;
	}

	// list的setter和getter方法
	public void setList(List<T> list)
	{
		this.list = list;
	}
	// 声明该List集合内的元素是Book类型时，对应成book元素
	@XmlElements({
		@XmlElement(name = "book", type = Book.class)
	})
	public List<T> getList()
	{
		return this.list;
	}
	@Override
	public String toString()
	{
		return "ListWrapper[list=" + this.list + "]";
	}
}