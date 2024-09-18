
class Resource {
    public Resource() {
        System.out.println("Taken Resource for reading data from files");
    }

    // Override the finalize() method
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Resource released explicitly in finalize(), read all the data from files");
        } finally {
            // Call the superclass finalize() method to ensure proper cleanup
            super.finalize();
        }
    }
}

public class AboutFinalize{

    public static void main(String args[]){
        Resource res = new Resource();
        res = null; // Make the object eligible for garbage collection

        // Requesting garbage collection (not guaranteed)
        System.gc();

        System.out.println("Main method ends.");
    }
}