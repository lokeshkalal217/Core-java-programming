package stringPrograms;

public class AnagramVerify {

	public static void main(String[] args) {

		String s1 = "Mother in Law";
		String s2 = "Hitler Woman";

		boolean b = isAnagram(s1, s2);
		System.out.println(b ? "Anagram" : "Not Anagram");

	}

	public static boolean isAnagram(String a, String b) {

		if (a.replaceAll("\\s", "").length() != b.replaceAll("\\s", "").length()) {
			return false;

		}

		char[] first = a.toLowerCase().replaceAll("\\s", "").toCharArray();
		char[] second = b.toLowerCase().replaceAll("\\s", "").toCharArray();

		java.util.Arrays.sort(first);
		java.util.Arrays.sort(second);

		return java.util.Arrays.equals(first, second);

	}

}
