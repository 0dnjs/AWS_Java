package ch16_lombok;

import javax.annotation.processing.Generated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
//@Setter
//@Getter
//@EqualsAndHashCode
//@ToString
@Data
public class Slave {
	private final String name;
	private int age;
	
}
