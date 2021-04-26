import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if(max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("C:\\Users\\hieu\\Java project\\16. IO Text File\\[Thuc hanh] Tim gia tri lon nhat va ghi ra file\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("C:\\Users\\hieu\\Java project\\16. IO Text File\\[Thuc hanh] Tim gia tri lon nhat va ghi ra file\\result.txt", maxValue);
    }
}
