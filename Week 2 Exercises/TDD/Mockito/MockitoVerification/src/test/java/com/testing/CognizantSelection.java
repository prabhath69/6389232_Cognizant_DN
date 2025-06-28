
package com.testing;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mock.*;
import java.util.List;


public class CognizantSelection {
	@Test
	public void testing() {
		CognizantList mocker=mock(CognizantList.class);
		
		CognizantCandidates candidates=new CognizantCandidates(mocker);
		
		candidates.getSelectedCandidateName();
		
		verify(mocker).getData();
		
	}
	
}
