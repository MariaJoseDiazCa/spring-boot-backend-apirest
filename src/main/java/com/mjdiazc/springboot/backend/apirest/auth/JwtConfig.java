package com.mjdiazc.springboot.backend.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEogIBAAKCAQEAtO5AQ2DRA0zUcYvdDk0OxyXon+1hBmwYIFqE7LGAMTA45Hli\r\n"
			+ "Q7r9BN9kPwsJB+jvk8TeSH9nXwty0S87jGtMVY3MBJfRqq97vmeeX0UEBg0MzDTV\r\n"
			+ "+NThHTZ60AEiygZ0iQRX7t0dPbzHF/cpLoRctGPkTPUij002e5Q7YkayYwOPjOjp\r\n"
			+ "YRPWoV+wlQIhCyrIx3YRtnnw4QK9pGrwgsMpveLzraKDgvzRObiGSonH7OBnYKY8\r\n"
			+ "PA8EoBhATgpRYHsYrm4rGF4PfZiSMqdtqBQVOaJ8cWGn0I8p/ondGjJWStVbnXsT\r\n"
			+ "9rwZnS0bVUmxTv8cE6JfAu+sVg7ufClevYJKCwIDAQABAoIBAFru62lxvVq1QIiY\r\n"
			+ "zM8lN2oryVCnk34Q0cdg9zGmvFD8dXuO7i4wSn4qcE2nFDDfh5ly9mzla2S/ckNk\r\n"
			+ "Q799Je5Rx9n/G6d3bu/xUA19uFn6MRZo76mSBFoUSYFFMODsgaFjh3ZLtyiSOlX3\r\n"
			+ "KMFyUM1w7wsmoOn42osdowLvmTRdej9m88RlxXF00a19W++6sqQdFMg2bDVEUhWd\r\n"
			+ "EYKfXgOdPcR2X6KgyfxO8EVw8w+Msyka94wvfe469rE0FGLssMm7o2Sac4W5g9sE\r\n"
			+ "M38Vj/+JJCSYZSgWCAcPmq2wbrU23HiNp7oTBD6XkW5nnhM02Ws7MeFYcZ7du9nP\r\n"
			+ "BDBPh+ECgYEA7ws6DslYKT0wGREYjnFwug5RNb2eBySPfGk+CF75bavj+Gw3bAr8\r\n"
			+ "NbqlIkN0IM7vcb3kV31wFMFQeAEp1gjW3y72NsUqTbJ/bZO1lU8+LAyK6PfeuEEj\r\n"
			+ "VaT37HA94WwqyXijEEiycYKClcwm8S49v44mWy+UNvaSJX34RBCOrMMCgYEAwcPA\r\n"
			+ "tIuQwrVrLhtKcxVohkTAACI+iehX5ttV43ad+Os3+M1FEcWQvtXyKv4TLWaY8R0n\r\n"
			+ "FQwp3x2Wk85DGS/+ueAevJDGSuyejEg07jk1y6oXSIGbG/OAiJ/1MV1v3C4p2brw\r\n"
			+ "arW98Afrys0yQpHdSi2vZVy8WsA5mMsfMna0ORkCgYAWbpFGLfLN++X1lDsfstmH\r\n"
			+ "PCy2xFJ+DRpB7IZbtr3lYsoD1/PjeaxtRlSUwIu3QHQL0mwJIcZQzEtG16UbZrzz\r\n"
			+ "OK72OM5deDCpEcFqf4MwEwU+E3SdCc/NC6wQTgAglUv2mBGFR60nJb4nXH8TBunY\r\n"
			+ "ffhveimIdt8EEawohv08jQKBgB6r4+cwaHvJx+uGemR5MRB/9XyP7yJZWwC6G4Bk\r\n"
			+ "GGF8qmGB7LsBcQYkS68uhM6c/Py9xp/4SvB8eIdxEQH9rO6zYWor6JeXmQlPrMFA\r\n"
			+ "4RkaFZFuoqTsCJ6X43Iq/jf2Pr2ub7wUhLpoJpT1ok0TVdoWHTuIUHB1GSjsjkWo\r\n"
			+ "sKKRAoGAXElcPyfeylEZZpL7bdnzGw8IJLdqwBsc4AvF4tPUYUSk9JdXqiPURxda\r\n"
			+ "++iBZuAT/+vRIv/7jiCavod+adHSsOQvbH7GkKqirn0VZ1o7HLcEt26dkXE8+TN5\r\n"
			+ "xcAztmZ7HcRcXZfyzaL9puGQ1YUtM2mxjz51v5+uS7WasiYFRMU=\r\n"
			+ "-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtO5AQ2DRA0zUcYvdDk0O\r\n"
			+ "xyXon+1hBmwYIFqE7LGAMTA45HliQ7r9BN9kPwsJB+jvk8TeSH9nXwty0S87jGtM\r\n"
			+ "VY3MBJfRqq97vmeeX0UEBg0MzDTV+NThHTZ60AEiygZ0iQRX7t0dPbzHF/cpLoRc\r\n"
			+ "tGPkTPUij002e5Q7YkayYwOPjOjpYRPWoV+wlQIhCyrIx3YRtnnw4QK9pGrwgsMp\r\n"
			+ "veLzraKDgvzRObiGSonH7OBnYKY8PA8EoBhATgpRYHsYrm4rGF4PfZiSMqdtqBQV\r\n"
			+ "OaJ8cWGn0I8p/ondGjJWStVbnXsT9rwZnS0bVUmxTv8cE6JfAu+sVg7ufClevYJK\r\n"
			+ "CwIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";

}
