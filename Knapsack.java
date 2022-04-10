public class mochila{

    private int numIntens;
    private int capaciMochila;
    private int [][] listaMochila;
    private int totalespaco;
    private int[] pesos;
    private int[] valores;

    public Mochila(int numIntens, int capaciMochila, int[] pesos, int[] valores){

        this.numIntens = numIntens;
        this.capaciMochila = capaciMochila;
        this.pesos = pesos;
        this.listaMochila = new int[numIntens+1][capaciMochila+1];
    }
      
    public void resolver (){ 

        for(int i=1;i<=numIntens+1;i++){
            for(int j=1; j<capaciMoachila+1;j++){

                int itemNot = listaMochila[i-1][j];
                int itemSim = 0;

                if(peso[i]<=j){
                    itemSim = valores[i] + listaMochila[i-1][j-pesos[i]];
                }
              
                listaMochila[i][j] = Math.max(itemNot, itemSim);

            }

        }

        totalespaco = listaMochila[numIntens][capaciMochila];
    }


}
