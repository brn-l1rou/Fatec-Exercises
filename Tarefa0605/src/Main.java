public class Main {

    public static Contato[] Bubble(Contato[] contatos){
        Contato temp;

        for(int i=0; i<contatos.length - 1;i++){
            for(int j=0;j<contatos.length - i - 1; j++){
                if(contatos[j].getNome().compareToIgnoreCase(contatos[j+1].getNome()) > 0){
                    temp = contatos[j];
                    contatos[j] = contatos[j+1];
                    contatos[j+1] = temp;
                }
            }
        }
        return contatos;
    }

    public static void main(String[] args) {
        Contato[] contatos = {
                new Contato("Roberto", "(13)99151523"),
                new Contato("Bruno", "(11)99261331"),
                new Contato("Mario", "(21)99131441"),
                new Contato("Joana", "(44)99864231"),
                new Contato("Vinicius", "(51)99151327"),
                new Contato("Caio", "(61)99031501")
        };

        System.out.println("Nomes desorganizados:");
        for(Contato n : contatos){
            System.out.println(n);
        }

        Contato[] contatosOrdenados =  Bubble(contatos);
        System.out.println("Nomes organizados:");
        for(Contato n : contatosOrdenados){
            System.out.println(n);
        }
    }
}