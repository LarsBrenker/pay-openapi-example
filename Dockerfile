FROM payara/micro:6.2023.6
COPY  ./target/openapi-mp41.war ${DEPLOY_DIR}