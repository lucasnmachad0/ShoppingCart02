public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";   //nome do comprador
        String itemDesc = "Camisas";//quantidade de camisetas
        String message = custName+" quer comprar duas "+itemDesc; //frase que mostra a quantidade de camisetas que alex quer comprar.
        
       //aqui tem o preço, o valor do imposto e a quantidade de camisetas.
        double preço = 22.50;  //valor da camiseta
        double imposto = 0.28; //valor do imposto
        int quantidade = 2;    //quantidade de camiseas
        
        //custo total com o preço, quantidade de camisetas e o imposto
        double custoTotal = (preço + quantidade) + (1 + imposto);
        
        System.out.println(message);
        System.out.println("o custo total com o imposto e: $" + custoTotal);
        //saida com a primeira mensagem e a segunda que é o resultado
        
    }    
}
