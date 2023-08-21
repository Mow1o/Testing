class EncapTest {
   private String name;
   private String idNum;
   private int age;

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public String getIdNum() {
      return idNum;
   }

   public void setAge( int newAge) {
      age = newAge;
   }

   public void setName(String newName) {
      name = newName;
   }

   public void setIdNum( String newId) {
      idNum = newId;
   }
   public static void main(String[] args) {
      EncapTest encap = new EncapTest();
    //   encap.setName("James");
    //   encap.setAge(20);
    //   encap.setIdNum("12343ms");
        if(args.length >= 2) {
            encap.setName(args[0]);
            encap.setAge(Integer.parseInt(args[1]));
        } else {
            System.out.println("Please provide a name and age as arguments.");
            return;
        }

        System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
    }
}