package data;

//每一行 CodownBook 的内容, 有笔记标题,  评论, 被选中的文本,  文件名, 文件类型
public class BookData {

    private String title;//笔记标题
    private String mark;//评论
    private String selectedText;//代码内被选中的内容
    private String fileName;//文件名
    private String fileType;//文件类型
    private String funcName;//提取的函数名称
    private String funcAccModifiers;//提取的函数访问修饰符
    private String funcReturnType;//提取的函数返回值类型
    private String funcParameters;//提取的函数参数

    public BookData(String title, String mark, String selectedText, String fileName, String fileType, String funcName, String funcAccModifiers, String funcReturnType, String funcParameters) {
        this.title = title;
        this.mark = mark;
        this.selectedText = selectedText;
        this.fileName = fileName;
        this.fileType = fileType;
        this.funcName = funcName;
        this.funcAccModifiers = funcAccModifiers;
        this.funcReturnType = funcReturnType;
        this.funcParameters = funcParameters;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getSelectedText() {
        return selectedText;
    }

    public void setSelectedText(String selectedText) {
        this.selectedText = selectedText;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public String getFuncAccModifiers() {
        return funcAccModifiers;
    }

    public void setFuncAccModifiers(String funcAccModifiers) {
        this.funcAccModifiers = funcAccModifiers;
    }

    public String getFuncReturnType() {
        return funcReturnType;
    }

    public void setFuncReturnType(String funcReturnType) {
        this.funcReturnType = funcReturnType;
    }

    public String getFuncParameters() {
        return funcParameters;
    }

    public void setFuncParameters(String funcParameters) {
        this.funcParameters = funcParameters;
    }



    @Override
    public String toString() {
        return "BookData{" +
                "title='" + title + '\'' +
                ", mark='" + mark + '\'' +
                ", selectedText='" + selectedText + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileType='" + fileType + '\'' +
                ", funcName='" + funcName + '\'' +
                ", funcName='" + funcAccModifiers + '\'' +
                ", funcName='" + funcReturnType + '\'' +
                ", funcName='" + funcParameters + '\'' +
                '}';
    }

}
