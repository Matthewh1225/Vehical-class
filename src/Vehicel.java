public abstract class Vehicel {
    
        private String name;
        int curGasAmount;
        int gasCapacity;


        int curFuleAmount(){
            return curGasAmount;

        }
        void refuleMax(){
            curGasAmount=gasCapacity;
            
        }
        void reful(int AmountToRefule){
            curGasAmount+=AmountToRefule;
            if (curGasAmount>gasCapacity){
                curGasAmount=gasCapacity;
            }

        }
        String getName(String name){
            return this.name;
        }
        void setName(String name){
            this.name=name;
        }

         void honk(){
            System.out.println("the " +getName(name)+" honking");
        }

    
}  




