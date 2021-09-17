POST /firewall-rules HTTP/1.1
Host: vmware.com
Connection: close
Content-Length: 264
Accept: application/json
Origin: https://www.vmware.com
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.132 Safari/537.36
Content-Type: application/json; charset=UTF-8
Referer: https://www.vmware.com
Accept-Encoding: gzip, deflate
Accept-Language: en-US,en;q=0.9
Cookie: auth-token=1517422416300;

{
  "destination": "192.168.1.1",
  "id": "",
  "rule_type": "USER",
  "action": "ALLOW",
  "name": "InternetAllow",
  "services": [
    {
      "ports": [],
      "protocol": "ICMP"
    }
  ],
  "source": "0.0.0.0",
  }