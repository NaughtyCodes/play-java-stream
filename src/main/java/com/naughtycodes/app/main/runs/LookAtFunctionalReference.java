package com.naughtycodes.app.main.runs;

interface MethodReference{
	void callMethod();
}
public class LookAtFunctionalReference {
	
	public static void callStaticMethod() {
		System.out.println("Calling for functional reference => Static Method Reference");
	}
	
	public void callInstanceMethod() {
		System.out.println("Calling for functional reference => Instance Method Reference");
	}

	public static void main(String args[]) {
		
		LookAtFunctionalReference lfr = new LookAtFunctionalReference();
		MethodReference mrInstance = lfr::callInstanceMethod;
		mrInstance.callMethod();
		
		MethodReference mrStatic = LookAtFunctionalReference::callStaticMethod;
		mrStatic.callMethod();
		
	}
	
}  
