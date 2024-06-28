grammar ArnoldC;

prog: meth_decl* BEGIN_MAIN (stmt)? END_MAIN EOF
    ;

meth_decl: DECLARE_METHOD ID (ARGS ID)* stmt END_METHOD                                   # voidMethod
      | DECLARE_METHOD ID (ARGS ID)* NON_VOID_METHOD stmt RETURN exp END_METHOD           # nonVoidMethod
      ;

stmt: DECLARE_INT ID SET_INITIAL_VALUE exp              # var_decl
    | ASSING ID SET_VALUE exp ops* END_ASSING           # var_assign
    | PRINT ID                                          # printid
    | PRINT STRING                                      # printstring
    | IF exp stmt (ELSE stmt)? END_IF                   # cond
    | WHILE exp stmt END_WHILE                          # while
    | (ASSIGN_FROM_METHOD ID)? CALL_METHOD ID (exp)*    # meth_call
    | stmt stmt                                         # stmt_concat
    ;

exp: NAT                                        # nat
    | op=(TRUE | FALSE)                         # bool
    | ID                                        # id
    ;

ops: op=(DIV | MUL | MOD) exp                  # divMulMod
   | op=(PLUS | MINUS) exp                     # plusMinus
   | GT exp                                    # gt
   | EQQ exp                                   # eq
   | op=(AND | OR) exp                         # logic
   ;


NAT: '0' | [1-9][0-9]*;
TRUE: '@NO PROBLEMO';
FALSE: '@I LIED';
STRING: '"' STRCHR* '"';
fragment STRCHR: ~["\\] | ESC;
fragment ESC: '\\' [btnfr"'\\];

PLUS: 'GET UP';
MINUS: 'GET DOWN';
MUL: 'YOU\'RE FIRED';
DIV: 'HE HAD TO SPLIT';
MOD: 'I LET HIM GO';

OR: 'CONSIDER THAT A DIVORCE';
AND: 'KNOCK KNOCK';

EQQ: 'YOU ARE NOT YOU YOU ARE ME';
GT: 'LET OFF SOME STEAM BENNET';

IF: 'BECAUSE I\'M GOING TO SAY PLEASE';
ELSE: 'BULLSHIT';
END_IF: 'YOU HAVE NO RESPECT FOR LOGIC';
WHILE: 'STICK AROUND';
END_WHILE: 'CHILL';
DECLARE_INT: 'HEY CHRISTMAS TREE';
SET_INITIAL_VALUE: 'YOU SET US UP';
PRINT: 'TALK TO THE HAND';
// READ_INT: 'I WANT TO ASK YOU A BUNCH OF QUESTIONS AND I WANT TO HAVE THEM ANSWERED IMMEDIATELY';
ASSING: 'GET TO THE CHOPPER';
SET_VALUE: 'HERE IS MY INVITATION';
END_ASSING: 'ENOUGH TALK';
// PARSE_ERROR: 'WHAT THE FUCK DID I DO WRONG';

DECLARE_METHOD: 'LISTEN TO ME VERY CAREFULLY';
NON_VOID_METHOD: 'GIVE THESE PEOPLE AIR';
ARGS: 'I NEED YOUR CLOTHES YOUR BOOTS AND YOUR MOTORCYCLE';
RETURN: 'I\'LL BE BACK';
END_METHOD: 'HASTA LA VISTA, BABY';
CALL_METHOD: 'DO IT NOW';
ASSIGN_FROM_METHOD: 'GET YOUR ASS TO MARS';

BEGIN_MAIN: 'IT\'S SHOWTIME';
END_MAIN: 'YOU HAVE BEEN TERMINATED';

ID: [a-zA-Z] [a-zA-Z0-9]* ;

WS: [ \t\r\n]+ -> skip;