import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    
    public static void main(String[] args) {
        
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Aldo", 9);
        notas.put("Juliana", 10);
        notas.put("Arildo", 8);

        var nota = notas.get("Aldo");
        System.out.println(nota); // 9

        for(Map.Entry<String,Integer> entry : notas.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é " + key + " e o valor é " + value);
        }
    }

}
