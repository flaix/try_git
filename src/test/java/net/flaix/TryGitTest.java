package net.flaix;

import static org.junit.Assert.*;

import org.junit.Test;


public class TryGitTest
{

	@Test
	public void testGetVersion()
	{
		assertNotNull(TryGit.getVersion());
	}

}