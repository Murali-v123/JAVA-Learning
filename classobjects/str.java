public class str {
    public static void main(String args[]) {
        
        // String st="hello";
        // System.out.println(st);
        // System.out.println(st.charAt(3));
        // System.out.println(st.concat(" world"));

        StringBuffer st=new StringBuffer("Hello");
        System.out.println(st.capacity());
        st.append(" world");
        System.out.println(st);
        st.deleteCharAt(3);
        System.out.println(st);
        st.insert(0, "java ");
        System.out.println(st);

        String s=st.toString();
        System.out.println(s);
    }
}

