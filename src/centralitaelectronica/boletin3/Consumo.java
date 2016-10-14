
package centralitaelectronica.boletin3;

//declaro atributos
public class Consumo {
    private float kilometros;
    private float litros;
    private float velocidadMedia;
    private float precioGasolina;
    //dos constructores
    public Consumo(){
        kilometros = 0;
        litros= 0;
        velocidadMedia= 0;
        precioGasolina=0;
    }
        public Consumo(float km,float lt,float vMed,float pGas){
        kilometros = km;
        litros = lt;
        velocidadMedia = vMed;
        precioGasolina = pGas;
    
        }
        
        //inicializa los metodos
    public float getTiempo(){
        float tiempo;
        tiempo=kilometros/velocidadMedia;
        return tiempo;
        
    }
    
    public void consumoMedio(){
        float consumo= litros*kilometros/100;
        System.out.println("el consumo medio es:= "+ (litros*kilometros/100));
    }
    public void consumoEuros(){
        float gastos= precioGasolina*kilometros/100;
        System.out.println("el consumo en euros es: = "+ (precioGasolina*kilometros/100));
         }
    
    public void setKms(float kilometros){
        this.kilometros=kilometros;
    }
    public void setLitros(float litros){
        this.litros= litros;
    }
    public void setvMed(float velocidadMedia){
        this.velocidadMedia= velocidadMedia;
    }
    public void setPgas(float precioGasolina){
        this.precioGasolina= precioGasolina;
    }
    public float getvMed(){
        return velocidadMedia;
        
    }    
}


    
        
    

   

