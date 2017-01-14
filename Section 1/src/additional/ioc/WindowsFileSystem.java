package additional.ioc;


public class WindowsFileSystem implements FileSystem {

    @Override
    public String readFile() {
        return "Windows file system read";
    }

}
