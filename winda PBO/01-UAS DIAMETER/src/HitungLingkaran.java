public class HitungLingkaran {
        double jarijari;
        double Diameter;
        double Keliling,Luas;
    
        HitungLingkaran(int jarijari){
            this.jarijari = 20.0;;
            this.Diameter = 40.0;
            this.Keliling = 2*Diameter*jarijari;
            this.Luas =Diameter*jarijari*jarijari;
        }
        void show(){
            System.out.println("jari-jari Lingkaran : " + this.jarijari+" cm");
            System.out.println("Keliling Lingkaran  : " + this.Keliling+" cm");
            System.out.println("Luas Lingkaran      : " + this.Luas+" cm");
        }
    }
    
    public class HitungLingkaran {
        public static void main(String[] args) throws Exception {
            HitungLingkaran hl = new HitungLingkaran(20);
            hl.show();
            HitungLingkaran h2 = new HitungLingkaran(40);
            h2.show();
            HitungLingkaran h3 = new HitungLingkaran(125);
            h3.show();
        }


        
    }
}
