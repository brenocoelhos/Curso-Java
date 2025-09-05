package utilities;

public class aluno {
    public String nome;
    public float[] nota = new float[3];

    public float resultado() {
         float aux = nota[0] + nota[1] + nota[2];
         if(aux > 60){
             System.out.println("Aluno aprovado");
         }else {
             System.out.println("Aluno reprovado");
             System.out.println("Falta: " + (60-aux) +" pontos ");
         }
         return aux;
    }
}
