package com.varun.designpatterns.builder;

public class URLBuilder {
    private final String hostName;
    private final String port;
    private final String pathParam;
    private final String queryParam;
    private final String protocol;

    private URLBuilder(Builder builder) {
        protocol = builder.protocol;
        hostName = builder.hostName;
        port = builder.port;
        pathParam = builder.pathParam;
        queryParam = builder.queryParam;
    }

    @Override
    public String toString() {
        return "URLBuilder{" +
                "protocol='" + protocol + '\'' +
                ", hostName='" + hostName + '\'' +
                ", port='" + port + '\'' +
                ", pathParam='" + pathParam + '\'' +
                ", queryParam='" + queryParam + '\'' +
                '}';
    }

    public static class Builder {
        private String protocol;
        private String hostName;
        private String port;
        private String pathParam;
        private String queryParam;

        public URLBuilder build() {
            return new URLBuilder(this);
        }

        public Builder hostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder port(String port) {
            this.port = port;
            return this;
        }

        public Builder pathParam(String pathParam) {
            this.pathParam = pathParam;
            return this;
        }

        public Builder queryParam(String queryParam) {
            this.queryParam = queryParam;
            return this;
        }
    }
}
