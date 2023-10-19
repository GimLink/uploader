package hello.uploader.domain;

import lombok.Data;

import java.util.List;

@Data
public class Item {

    private String itemName;
    private Long id;
    private UploadFile attachfile;
    private List<UploadFile> imageFiles;


}
