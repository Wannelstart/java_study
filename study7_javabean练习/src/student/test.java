package student;

public class test {
    public static void main(String[] args) {


        student[] arr = new student[3];
        student stu1 = new student(1, "张三", 15);
        student stu2 = new student(2, "李四", 16);
        student stu3 = new student(3, "阿美", 15);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;



        //1、再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        student stu4 = new student(4, "王五", 16);
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            System.out.println("学号重复，请重新输入");

        } else {
            //分为数组存满和没有存满的情况
            int count = full(arr);
            if (count == arr.length) {
                //创建新数组
                arr = creatnew(arr);

                arr[count] = stu4;

            }else{
                arr[count] = stu4;
            }

        }


        //2、遍历数组，输出所有学生的信息
        printarr(arr);
        System.out.println();

        //3、通过id删除学生信息，如果存在则删除，如果不存在则提示删除失败
        //先找id的索引
        int id=3;
        int index = index(arr, id);
        if(index>=0){
            arr[index] = null;
            printarr(arr);
            System.out.println();
        }else{
            System.out.println("删除失败");
        }


        //4、查询数组id为2的学生，如果存在，则把他的年龄加1
        int ind= index(arr, 2);
        if(ind>=0){
            student stu = arr[ind];
            int age = stu.getAge();
            stu.setAge(age+1);
        }else{
            System.out.println("查询失败");
        }
        printarr(arr);









    }
//定义一个方法判断数组中是否包含某个学号
        public static boolean contains (student[]arr,int id){
            for (int i = 0; i < arr.length; i++) {
                student stu = arr[i];
                if(stu!=null){
                int sid = stu.getId();
                if (sid == id) {
                    return true;
                }}
            }
            return false;

        }


//定义一个方法判断数组是否存满了
        public static int full (student[]arr){
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null) {
                    count++;
                }
            }
            return count;
        }

//创建新数组
        public static student[] creatnew(student[] arr) {
            student[] newarr = new student[arr.length +1];

            for (int i = 0; i < arr.length; i++) {
                newarr[i] =arr[i];
            }
            return newarr;
        }

//遍历打印

        public static void printarr(student[] arr) {
            for (int i = 0; i < arr.length; i++) {
                student stu = arr[i];
                if(stu!=null){
                    System.out.println(stu.getId() + " " + stu.getName() + " " + stu.getAge());
                }
            }
        }

//找到id在数组中的索引
        public static int index(student[] arr,int id){
            for (int i = 0; i < arr.length; i++) {
                student stu =arr[i];
                if(stu!=null){
                    int sid = stu.getId();
                    if(sid==id){
                        return i;
                    }
                }
            }
            return -1;

        }

}