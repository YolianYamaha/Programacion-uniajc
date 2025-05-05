public class EjecutarCajeroElectronico {
    public static void main(String[] args) {
        CajeroElectronico objP1 = new CajeroElectronico(1000.0);
    

    System.out.println("nuevo saldo: "+ objP1.depositar(1300.0));



    System.out.println("saldo actual: " + objP1.consultarSaldo());

    
    objP1.retirar(2000.0);

    objP1.transferir(200.0,"medelin");
    
    
    
    }




    
}
