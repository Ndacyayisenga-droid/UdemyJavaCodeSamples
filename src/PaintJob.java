public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double wallArea = width * height;
        double bucketsNeeded = (wallArea / areaPerBucket) - extraBuckets;

        return (int) Math.ceil(bucketsNeeded);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double wallArea = width * height;
        double bucketsNeeded = wallArea / areaPerBucket;

        return (int) Math.ceil(bucketsNeeded);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double bucketsNeeded = area / areaPerBucket;

        return (int) Math.ceil(bucketsNeeded);
    }
}
