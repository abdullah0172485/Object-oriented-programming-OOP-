public class stringMethode {
    public static void main(String[] args) {
        //contains()
        String fruit1 = "mango";
        String fruit2 = "orange";
        int result = fruit1.compareTo(fruit2);
        System.out.println(result); // Output: -1 (mango comes before orange)

        //substring()
        String phrase = "mountain view";
        String part = phrase.substring(8);
        System.out.println(part); // Output: "view"

        //join()
        String[] items = {"apple", "banana", "grape"};
        String joined = String.join("-", items);
        System.out.println(joined); // Output: "apple-banana-grape"

        //replace()
        String line = "rainy day";
        String newLine = line.replace("rainy", "sunny");
        System.out.println(newLine); // Output: "sunny day"

        //replaceAll()
        String code = "a1b2c3";
        String updated = code.replaceAll("[0-9]", "#");
        System.out.println(updated); // Output: "a#b#c#"

        //replaceFirst()
        String data = "a1b1c1";
        String modified = data.replaceFirst("[0-9]", "#");
        System.out.println(modified); // Output: "a#b1c1"

        //charAt()
        String word = "river";
        char letter = word.charAt(2);
        System.out.println(letter); // Output: v

        //getBytes()
        String message = "sky";
        byte[] bytes = message.getBytes();
        for (byte b : bytes) {
            System.out.println(b); // Output: byte values (e.g., 115, 107, 121 for "sky")
        }

        //indexOf()
        String path = "forest trail";
        int position = path.indexOf("trail");
        System.out.println(position); // Output: 7

        //compareTo()
        String fruit1 = "mango";
        String fruit2 = "orange";
        int result = fruit1.compareTo(fruit2);
        System.out.println(result); // Output: -1 (mango comes before orange)

        //compareToIgnoreCase()
        String city1 = "Paris";
        String city2 = "paris";
        int result = city1.compareToIgnoreCase(city2);
        System.out.println(result); // Output: 0 (equal when ignoring case)

        //trim()
        String sentence = "  sunny hills  ";
        String cleaned = sentence.trim();
        System.out.println(cleaned); // Output: "sunny hills"

        //format()
        String message = String.format("The event is on %s at %d PM", "Friday", 7);
        System.out.println(message); // Output: "The event is on Friday at 7 PM"

        //split()
        String data = "cat;dog;bird";
        String[] animals = data.split(";");
        for (String animal : animals) {
            System.out.println(animal); // Output: cat, dog, bird (each on a new line)
        }

        //toLowerCase()
        String title = "SUMMER FESTIVAL";
        String lowerTitle = title.toLowerCase();
        System.out.println(lowerTitle); // Output: "summer festival"

        //toUpperCase()
        String name = "riverside";
        String upperName = name.toUpperCase();
        System.out.println(upperName); // Output: "RIVERSIDE"

        //valueOf()
        double price = 19.99;
        String priceStr = String.valueOf(price);
        System.out.println(priceStr); // Output: "19.99"

        //toCharArray()
        String word = "galaxy";
        char[] chars = word.toCharArray();
        for (char c : chars) {
            System.out.println(c); // Output: g, a, l, a, x, y (each on a new line)
        }

        //matches()
        String code = "xyz789";
        boolean isValid = code.matches("[a-z]{3}[0-9]{3}");
        System.out.println(isValid); // Output: true (3 letters followed by 3 digits)

        //startsWith()
        String path = "documents/report.pdf";
        boolean starts = path.startsWith("documents");
        System.out.println(starts); // Output: true

        //endsWith()
        String file = "image.png";
        boolean ends = file.endsWith(".png");
        System.out.println(ends); // Output: true

        //isEmpty()
        String empty = "";
        String text = "ocean";
        System.out.println(empty.isEmpty()); // Output: true
        System.out.println(text.isEmpty()); // Output: false

        //intern()
        String str1 = new String("cloud").intern();
        String str2 = "cloud";
        System.out.println(str1 == str2); // Output: true (same reference in string pool)

        //contentEquals()
        String phrase = "sunset";
        StringBuilder builder = new StringBuilder("sunset");
        boolean equals = phrase.contentEquals(builder);
        System.out.println(equals); // Output: true

        //hashCode()
        String key = "bridge";
        int hash = key.hashCode();
        System.out.println(hash); // Output: (hash code for "bridge", e.g., 93902669)

        //subSequence()
        String quote = "inspire daily";
        CharSequence sub = quote.subSequence(0, 7);
        System.out.println(sub); // Output: "inspire"

    }
}