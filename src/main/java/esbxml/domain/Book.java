package esbxml.domain;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "book")
public class Book
{
	private Integer id;
	private String name;
	private String author;
	private double price;

	// id的setter和getter方法
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}

	// name的setter和getter方法
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	// author的setter和getter方法
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public String getAuthor()
	{
		return this.author;
	}

	// price的setter和getter方法
	public void setPrice(double price)
	{
		this.price = price;
	}
	public double getPrice()
	{
		return this.price;
	}

	@Override
	public String toString()
	{
		return "Book[id=" + this.id + ", name=" + this.name + ", author=" + this.author + ", price=" + this.price + "]";
	}
}