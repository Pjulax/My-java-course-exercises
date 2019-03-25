public class Main {
    public static void main(String[] args) {
        System.out.println(PaintJob.getBucketCount(5.0,10.25,2.30,5));
        System.out.println(PaintJob.getBucketCount(-1.9,15.9,2,3));
        System.out.println(PaintJob.getBucketCount(5.0,10.25,2.30,-5));
        System.out.println(PaintJob.getBucketCount(5.0,10.25,-2.30,5));
        System.out.println(PaintJob.getBucketCount(5.0,-10.25,2.30,5));
        System.out.println(PaintJob.getBucketCount(5.0,10.25,2.30,0));
        System.out.println(PaintJob.getBucketCount(5.0,10.25,2.30));
        System.out.println(PaintJob.getBucketCount(10.25,2.30));
        System.out.println(PaintJob.getBucketCount(-10.25,2.30));
        System.out.println(PaintJob.getBucketCount(10.25,-2.30));

    }
}
