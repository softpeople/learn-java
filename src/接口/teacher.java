package 接口;

public  class teacher implements chouyan {
    @Override
    public void smoke(){
        System.out.println("抽烟有害");
    }

    @Override
    public void buchou() {
        System.out.println("不抽烟真好");
    }
}
