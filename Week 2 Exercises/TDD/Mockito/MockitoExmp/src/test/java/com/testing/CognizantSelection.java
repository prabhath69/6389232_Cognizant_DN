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
		
		when(mocker.getData()).thenReturn(List.of("Mock 1","Mock 2"));
		
		CognizantCandidates candidates=new CognizantCandidates(mocker);
		
		List<String> result = candidates.getSelectedCandidateName();
		
		assertEquals(2, result.size());
        assertTrue(result.contains("Mock 1"));
        assertTrue(result.contains("Mock 2"));
	}
	
}
