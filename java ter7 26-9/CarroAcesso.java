public class CarroAcesso {
    public static void main(String[] args) {
        CarroE uno = new CarroE("Uno");
        uno.setCor("vermelho");
        uno.setMarca("Fiat");
        CarroE renegade = new CarroE("Renegade", "Jeep", "Prata");
        System.out.println("modelo: " + uno.getModelo());
        System.out.println("cor: " + renegade.getCor());
    }
}