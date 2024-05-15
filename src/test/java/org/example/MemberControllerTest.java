package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.restdocs.RestDocumentationContextProvider;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.restdocs.operation.preprocess.Preprocessors;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;

@ExtendWith(RestDocumentationExtension.class)
@SpringBootTest // setup 파라미터 자동 주입을 위해 필요
public class MemberControllerTest {
    private MockMvc mockMvc;

    @BeforeEach
    public void setUp(WebApplicationContext webApplicationContext, RestDocumentationContextProvider restDocumentation) {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
                .apply(documentationConfiguration(restDocumentation))
                .build();
    }

    // generated-snippets 하위에 document() 파라미터 값에 해당하는 경로로 코드 스니펫 만듦
    @Test
    public void getTestTest() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/member/v1.0")
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(document("get-member",
                        // json 포맷팅
                        Preprocessors.preprocessRequest(prettyPrint()),
                        Preprocessors.preprocessResponse(prettyPrint()),

                        // TODO
                        /*pathParameters(parameterWithName("name").description("PathVariable name")),
                        requestFields(
                                fieldWithPath("name").description("The name of the input")),*/
                        responseFields(
                                fieldWithPath("memberId").description("The id of the output"),
                                fieldWithPath("nickname").description("The name of the output"),
                                fieldWithPath("email").description("The email of the output"),
                                fieldWithPath("productDTO").description("The product"),

                                fieldWithPath("productDTO.productId").description("The product"),
                                fieldWithPath("productDTO.name").description("The product"),
                                fieldWithPath("productDTO.price").description("The product")
                        )
                ));
    }
}
