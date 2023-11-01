package obj_paw;

public class Obj059 {
        private static String id059;
        private String namepaw;
        private double value059;

        public Obj059(String id059, String namepaw, double value059) {
            Obj059.id059 = id059;
            this.namepaw = namepaw;
            this.value059 = value059;
        }

        public static String getId059() {
            return id059;
        }

        public static void setId059(String id059) {
            Obj059.id059 = id059;
        }

        public String getNamepaw() {
            return this.namepaw;
        }

        public void setNamepaw(String namepaw) {
            this.namepaw = namepaw;
        }

        public double getValue059() {
            return this.value059;
        }

        public void setValue059(double value059) {
            this.value059 = value059;
        }

        public String toString() {
            String var10000 = getId059();
            return "Obj059{id059='" + var10000 + "', namepaw='" + this.getNamepaw() + "', value059=" + this.getValue059() + "}";
        }

        public static int compare(Obj059 o1, Obj059 o2) {
            if (o1.getValue059() == o2.getValue059()) {
                return 0;
            } else {
                return o1.getValue059() < o2.getValue059() ? -1 : 1;
            }
        }

        public boolean isGreaterThan(Obj059 o) {
            return this.getValue059() > o.getValue059();
        }
    }


}
