class parent<T>
{
	T val;
	void set(T val)
	{
		this.val=val;
	}
	T get()
	{
		return val;
	}
}

class child<T> extends parent<T>
{
	
}

class paramete_par_clsWit_genchild
{
	public static void main(String args[])
	{
		child<Integer> i=new child<>();
		child<String> s=new child<>();
		
		i.set(120);
		s.set("parameterised parent class with generic chlid class");
		
		System.out.println(i.get());
		System.out.println(s.get());
		
	}
}