package cn.ieclipse.smartim.actions;

import cn.ieclipse.smartim.console.IMChatConsole;
import icons.SmartIcons;

public class SendImageAction extends SendFileAction {

    public SendImageAction(IMChatConsole console) {
        super(console);
        this.setToolTipText("发送图片");
        this.setIcon(SmartIcons.image);
        this.filter = filter_image;
    }

}
