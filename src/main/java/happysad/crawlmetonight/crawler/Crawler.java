package happysad.crawlmetonight.crawler;

public abstract class Crawler
{
	/**
	 * Starting directory of the crawler.
	 */
	private String startDir;
	
	/**
	 * Current directory of the crawler.
	 */
	private String currDir;
	
	/**
	 * Ending directory of the crawler.
	 */
	private String endDir;
	
	/**
	 * Is crawling process recursive flag.
	 */
	private boolean isRecursive;
	
	/**
	 * Initial timeout for crawling between files.
	 */
	private long timeout = 100;
	
	public Crawler()
	{
		
	}
	
	/**
	 * Container for the crawl implementation.
	 */
	public abstract void crawl();
	
	/**
	 * Gets the starting directory of the crawler.
	 * 
	 * @return Starting directory of the crawler.
	 */
	public String getStartingDirectory()
	{
		return startDir;
	}
	
	/**
	 * Sets the starting directory of the crawler.
	 * 
	 * @param startDir starting directory of the crawler.
	 */
	public void setStartingDirectory(String startDir)
	{
		this.startDir = startDir;
	}
	
	/**
	 * Gets the directory that the crawler is processing.
	 * 
	 * @return Current directory of the crawler.
	 */
	public String getCurrentDirectory()
	{
		return currDir;
	}
	
	/**
	 * Sets the current directory of the crawler.
	 * 
	 * @param currDir current directory that the crawler is processing.
	 */
	public void setCurrentDirectory(String currDir)
	{
		this.currDir = currDir;
	}
	
	/**
	 * Gets the directory where the crawler should finish crawling.
	 * 
	 * @return Ending directory of the crawler.
	 */
	public String getEndingDirectory()
	{
		return endDir;
	}
	
	/**
	 * Sets the directory of the crawler where the crawler should stop crawling.
	 * 
	 * @param endDir ending directory of the crawler.
	 */
	public void setEndingDirectory(String endDir)
	{
		this.endDir = endDir;
	}
	
	/**
	 * Returns status of the crawler if it is using recursive methods or generating new crawlers.
	 * 
	 * @return True if using recursive methods.
	 */
	public boolean isRecursive()
	{
		return isRecursive;
	}
	
	/**
	 * Uses the recursive methods via the same crawler to crawl through directories.
	 * If flag is set false, then a new crawler is generated for a new directory.
	 * 
	 * @param isRecursive flag for usage of recursive method.
	 */
	public void isRecursive(boolean isRecursive)
	{
		this.isRecursive = isRecursive;
	}
	
	/**
	 * Gets the timeout period that is being used in between every file / directory crawled.
	 * 
	 * @return Timeout period in <i>ms</i>.
	 */
	public long getTimeout()
	{
		return timeout;
	}
	
	/**
	 * Sets the timeout period used in between every file / directory crawled.
	 * 
	 * @param timeout time in <i>ms</i>.
	 */
	public void setTimeout(long timeout)
	{
		this.timeout = timeout;
	}
}
