public class Lessons_strings

public static void main(String[] args) {
		
		// 1. Друкую довільний рядок "a"
		String a = " Hello from Java ";
		System.out.println (a);
		
		// 2. Друкую рядок, з використанням складання рядків "a" + "b"
		String b = " Development ";
		System.out.println(a + b);
		
		// 3. Об'єдную рядок з числом
		int c = 7;
		System.out.println(a + c + b);
		
		// 4. Використовую System.out.prin(...) для виводу на екран
		System.out.print(a + c + b);
		
		// 5. Дізнаюсь чи можливо вивести на екран порожній рядок :)
		String text = "  ";
		System.out.print (text);
		
	}
}
