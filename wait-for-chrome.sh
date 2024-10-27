#!/bin/bash

# Set timeout duration in seconds
TIMEOUT=60
CHROME_PATH="/opt/google/chrome/chrome"

# Wait for Chrome to start
echo "Waiting for Chrome to start..."
for ((i=0; i<TIMEOUT; i++)); do
  if pgrep -f "$CHROME_PATH" > /dev/null; then
    echo "Chrome started successfully."
    exit 0
  fi
  sleep 1
done

echo "Timeout: Chrome did not start within $TIMEOUT seconds."
exit 1

# Capture Chrome logs
CHROME_LOG_FILE="chrome.log"
CHROME_DRIVER_LOG_FILE="chromedriver.log"

# Wait for Chrome to start
wait $!

# Log Chrome and ChromeDriver output for debugging
echo "Chrome logs:"
cat $CHROME_LOG_FILE || echo "No Chrome logs found."
echo "ChromeDriver logs:"
cat $CHROME_DRIVER_LOG_FILE || echo "No ChromeDriver logs found."
