import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Person> list = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            list.add(new Person(arr[0], arr[1]));
        }
        Collections.sort(list, (p1, p2) -> {
            if (p1.age == p2.age) {
                return 0;
            }
            if (p1.age < p2.age) {
                return -1;
            }
            return 1;
        });

        for (Person person : list) {
            sb.append(person.age).append(" ").append(person.name).append("\n");
        }
        System.out.println(sb);
    }
}

class Person {
    int age;
    String name;

    public Person(String age, String name) {
        this.age = Integer.parseInt(age);
        this.name = name;
    }
}