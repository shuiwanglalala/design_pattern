package refactoring_guru.java;

import java.io.*;

// 学生的所学专业
public class Major implements Serializable {
    private String majorName; // 专业名称
    private long majorId;     // 专业代号

    public Student clone() {
        try {
            // 将对象本身序列化到字节流
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream( byteArrayOutputStream );
            objectOutputStream.writeObject( this );

            // 再将字节流通过反序列化方式得到对象副本
            ObjectInputStream objectInputStream =
                    new ObjectInputStream( new ByteArrayInputStream( byteArrayOutputStream.toByteArray() ) );
            return (Student) objectInputStream.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String toString() {
        return "Major{" +
                "majorName='" + majorName + '\'' +
                ", majorId=" + majorId +
                '}';
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public long getMajorId() {
        return majorId;
    }

    public void setMajorId(long majorId) {
        this.majorId = majorId;
    }

    public Major(String majorName, long majorId) {
        this.majorName = majorName;
        this.majorId = majorId;
    }
// ... 其他省略 ...
}
