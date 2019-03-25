public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets >= 0){
            int bucketsCount = (int)(Math.ceil( (width * height) / areaPerBucket) ) - extraBuckets;
            return bucketsCount;
        }
        return -1;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if(area > 0 && areaPerBucket > 0){
            int bucketsCount = (int)(Math.ceil( area / areaPerBucket) );
            return bucketsCount;
        }
        return -1;
    }
}
