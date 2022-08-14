package interfaceUse;

public interface MyInterface 
{
	//1.Data Member and variables declared inside Interface are by default static and final
	int a=90;
	// a=a+1;  a value is by default final in interface so it cannot update
	
	//2.Methods declared inside interface are by default public and abstract
	void test1();
	void test2();
	

}
