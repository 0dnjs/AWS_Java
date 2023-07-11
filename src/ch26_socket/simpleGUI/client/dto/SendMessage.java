package ch26_socket.simpleGUI.client.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SendMessage {
	private String tousername;
	private String fromUsername;
	private String messageBody;
}
